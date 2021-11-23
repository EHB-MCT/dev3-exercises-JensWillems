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
        "Chose your destination city between Brussels or Antwerp"
    )

    val search = readLine()
    val statement = connection.prepareStatement("SELECT * FROM S6_rides WHERE destination = ? ")

    statement.setString(1, search)
    val result = statement.executeQuery()
    while(result.next()) {
        println(
            result.getString("departure_time")
        )

    }









}

