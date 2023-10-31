import java.nio.file.Files
import java.nio.file.Paths
import java.nio.charset.Charset

data class Packet(val number: Int, val data: String)

fun readFileToString(fileName: String) {

    try {
        val filecontent = String(Files.readAllBytes(Paths.get(fileName)), Charset.defaultCharset())
        println(filecontent)
    } catch (e: Exception) {
        e.printStackTrace()
    }
}

fun breakIntoPackets(message: String, chunkSize: Int): List<Packet> {
    val packets = mutableListOf<Packet>()
    var packetNumber = 1

    for (i in message.indices step chunkSize) {
        val chunk = message.substring(i, kotlin.math.min(i + chunkSize, message.length))
        val packet = Packet(packetNumber, chunk)
        packets.add(packet)
        packetNumber++
    }

    return packets
}

fun sendPackets(packets: List<Packet>) {
    val shuffledPackets = packets.shuffled()
    shuffledPackets.forEach { packet ->
        println("Sending packet ${packet.number}: ${packet.data}")
    }
    println("All packets sent.")
}

fun receivePackets(packets: List<Packet>) {
    val receivedPackets = mutableListOf<Packet>()

    packets.forEach { packet ->
        receivedPackets.add(packet)
        println("Received packet ${packet.number}: ${packet.data}")
    }
    println("All packets received.")

    receivedPackets.sortBy { it.number }
    val reconstructedMessage = receivedPackets.joinToString("") { it.data }
    println("Reconstructed message:\n$reconstructedMessage")
}

fun main() {
    print("Enter the file name: ")
    val fileName = readLine() ?: ""

    val fileContent = readFileToString(fileName)
    if (fileContent != null) {
        val chunkSize = 5
        val packets = breakIntoPackets(fileContent.toString(), chunkSize)

        // Simulate the transmit and receive process
        sendPackets(packets)
        println()
        receivePackets(packets)
    }
}
