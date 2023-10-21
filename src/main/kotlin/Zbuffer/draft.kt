package Zbuffer

import java.awt.Color
import java.awt.image.BufferedImage
import javax.swing.JFrame
import javax.swing.JPanel

class ZBufferDemo : JPanel() {
    private val width = 800
    private val height = 600
    private val zBuffer = Array(width) { LongArray(height) { Long.MAX_VALUE } }

    init {
        val frame = JFrame("Z-Buffer Demo")
        frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
        frame.contentPane.add(this)
        frame.setSize(width, height)
        frame.isVisible = true
    }

    override fun paintComponent(g: java.awt.Graphics) {
        val image = BufferedImage(width, height, BufferedImage.TYPE_INT_RGB)
        val g2d = image.createGraphics()

        // Clear the Z-buffer and the image
        for (x in 0 until width) {
            for (y in 0 until height) {
                zBuffer[x][y] = Long.MAX_VALUE
                image.setRGB(x, y, Color.BLACK.rgb)
            }
        }

        // Simulate rendering of a 3D object
        renderObject(g2d, 400, 300, 100, 100) // Example object

        g.drawImage(image, 0, 0, this)
    }

    private fun renderObject(g2d: java.awt.Graphics2D, x: Int, y: Int, z: Int, size: Int) {
        for (i in x until x + size) {
            for (j in y until y + size) {
                // Calculate depth index
                val depthIndex = zBuffer[i][j]

                // Check if the current object pixel is closer than what's in the Z-buffer
                if (z < depthIndex) {
                    zBuffer[i][j] = z.toLong()

                    // Determine the color based on depth
                    val color: Color = when {
                        z < 100.0 -> Color.BLACK
                        z < 200.0 -> Color.WHITE
                        else -> Color.RED
                    }

                    // Render the pixel in the determined color
                    g2d.color = color
                    g2d.drawRect(i, j, 1, 1)
                }
            }
        }
    }
}

fun main() {
    ZBufferDemo()
}
