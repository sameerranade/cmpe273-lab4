package edu.sjsu.cmpe.cache.client;

public class Client {

    public static void main(String[] args) throws Exception {

        System.out.println("Starting Cache Client");

        CRDTClient crdtClient = new CRDTClient();
        System.out.println("PUT Request: Key = 1 & Value = 'a' on 3 servers asynchronously");

        boolean isSuccessful = crdtClient.put(1, "a");
        if (isSuccessful) {
            System.out.println("Successful --> PUT Request: Key = 1 & Value = 'a'");
        } else {
            System.out.println("Error --> PUT Request: Key = 1 & Value = 'a' ");
        }
        Thread.sleep(30000);
        System.out.println("PUT Request: Key = 1 & Value = 'b' on 3 servers asynchronously");

        isSuccessful = crdtClient.put(1, "b");
        if (isSuccessful) {
            System.out.println("Successful --> PUT Request: Key = 1 & Value = 'b'");
        } else {
            System.out.println("Error --> PUT Request: Key = 1 & Value = 'b'");
        }
        Thread.sleep(30000);

        System.out.println("GET Request: Value of Key:1 from all servers");
        String cachedValue = crdtClient.get(1);
        System.out.println("GET Request: Value of Key:1 "+ cachedValue + " from all servers");

        System.out.println("Exiting Client");
    }
}