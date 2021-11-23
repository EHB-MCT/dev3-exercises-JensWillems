import java.sql.*
import java.util.*

fun main(){
    Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance()

    val credentials = Credentials()

    // Prepare credentials
    val connectionProps = Properties()
    connectionProps["user"] = credentials.databaseUser
    connectionProps["password"] = credentials.databasePassword

    // Create the connection: this will allow us to run queries on it later
    val connection =  DriverManager.getConnection(
        "jdbc:" + "mysql" + "://" +
                "dt5.ehb.be" +
                ":" + "3306" + "/" +
                credentials.databaseName,
        connectionProps)
println(
    "Where are you ? Brussels or Antwerp"
)
    val position = readLine()
    println(
        "Chose your destination city between Brussels or Antwerp"
    )

    val search = readLine()
    val statement = connection.prepareStatement("SELECT * FROM S6_rides WHERE destination = ? AND start_city = ? ORDER BY departure_time LIMIT 1" )

    statement.setString(1, search)
    statement.setString(2, position)
    val result = statement.executeQuery()
    while(result.next()) {
        println(
            "From "+ result.getString("start_city") + " at " +
            result.getString("departure_time") + " to " + result.getString("destination")
        )

    }









}

