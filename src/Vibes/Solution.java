//package Vibes;
//
//import java.io.BufferedReader;
//import java.io.FileReader;
//
//public class Solution {
//    public static void main(String[] args) {
//
//        /*
//        *
//        * Create a class to parse a file from your local folder.
//        * Construct an SMS message and Send it to the JMS queue to be processed by the downstream application.
//
//Given:
//
//File is in the comma-separated format as follows
//Code, Number, Text
//63901,+12995551234,Hello world
//63901,+13995551234,Hello world 2
//* 747474,Hello world
//
//Utility Method is available:
//You can define the method definition, however, is appropriate, and just call from your code.
//
//        *
//        * */
//
//        /**
//         *
//         * 1. Read the file
//         * 2. Iterate through each line in the file and
//         * 3. Extract data --> parser into arr ---> arr[0] --> code,arr[1] --> Number, arr[2] --> text
//         * 4. setup the sms class (code,number,text)
//         * 5. pus
//         * **/
//
//
//
//        //---> Read the file --->
//        String file_location = "sddsdsds";
//        BufferedReader reader = new BufferedReader(new FileReader(file_location));
//        String line;
//        String code,number,text;
//        String[] parts;
//        //--iterate through each line in the file
//        while ((line = reader.readLine()) != null){
//             parts = line.split(",");
//             if (parts.length < 3){
//                 //go to next
//             }
//             code = parts[0];
//             number = parts[1];
//             text = parts[2];
//
//            SmsMessage smsMessage = new SmsMessage(code,number,text);
//
//            JMS.enque(smsMessage);
//        }
//        reader.close();
//
//    }
//}
// class SmsMessage{
//    private String code;
//    private String number;
//    private String text;
//
//    //---> getters and setters
//     public SmsMessage(String code,String number,String text){
//         this.code = code;
//         this.number = number;
//         this.text = text;
//     }
//
//     public void SetCode(String code){
//         if (code ==null){
//             this.code = "";
//         }
//         this.code = code;
//     }
//
// }
//
//
