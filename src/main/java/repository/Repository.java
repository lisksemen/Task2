package repository;

import java.io.*;

public class Repository {
    public static final String BROADCAST_FILE = "broadcasts.txt";
    public static final String HOSTS_FILE = "hosts.txt";

    public static void saveBroadcasts(Broadcasts broadcasts) throws IOException {
        var outputStream = new ObjectOutputStream(new FileOutputStream(BROADCAST_FILE));
        outputStream.writeObject(broadcasts);
        outputStream.close();
        outputStream.flush();
    }

    public static Broadcasts loadBroadcasts() throws IOException, ClassNotFoundException {
        var inputStream = new ObjectInputStream(new FileInputStream(BROADCAST_FILE));
        Broadcasts result = (Broadcasts) inputStream.readObject();
        inputStream.close();
        return result;
    }

    public static void saveHosts(Hosts hosts) throws IOException {
        var outputStream = new ObjectOutputStream(new FileOutputStream(HOSTS_FILE));
        outputStream.writeObject(hosts);
        outputStream.close();
        outputStream.flush();
    }

    public static Hosts loadHosts() throws IOException, ClassNotFoundException {
        var inputStream = new ObjectInputStream(new FileInputStream(HOSTS_FILE));
        Hosts result = (Hosts) inputStream.readObject();
        inputStream.close();
        return result;
    }
}
