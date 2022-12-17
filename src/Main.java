public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
//        ABCDEFGHIJKLMNOPQRSTUVWXYZ
        //key => integer, integer represents the index that we are going to add to the letter
        //A, 3 => D
        //B, 2 => D
        //C, 7 => J
        //M, 5 => R
        //W, 6 => C
        //Z, 1 => A
        //Hello, 5 => MJQQT
        //
        //
        //Hello World git!

//        1.Encryption/decryption with a key
        //recieve some sort of text file
        //Encrypt or Decrpyt it
        //file and you get a key(integer > 0)

        //2. Cryptanalysis.
        //get a text to decrpyt
        //a. brute force
        //b. Cryptanalysis using statistical data

        //a.
        //ABCDEFGHIJKLMNOPQRSTUVWXYZ
        //MJQQT, 1
        //LIPPS
        // use index 2
        //KHOOR -> not a word
        //...
        // index 5
        //Hello
        // 26 times becuase you are going from 1 to 26


        //b. Cryptanalysis using statistical data
        // another file -> decrpyted -> actual words
        //2 files
        //a file is encrypted
        //a another file is decrypted
        //
        // look at the decrypted file first
        // count the amount of occurences of each letter
        // {a: 29, b: 3, c: 90}
        // count the amount of total words
        // counter -> totalLetters = 122 -> (27 words)

        //look at the encrypted file
        //do the same as the decrypted file
        // b-> 8% occurence in the decrypted file
        // e-> 8% occurence in the encrypted file

        //ABCDEFGHIJKLMNOPQRSTUVWXYZ
        // key = index(e) - index(b) = 3

        //go through encrypted file and decrypt using the key you found (3)
        // check if the decryption was successful
        // check if the words in the decrypted we just decrypted
        // are actual words
        //
        // check against the file that has all english words on it
        //
        // 24 words in the file we just decrypted are actual words
        // and 3 words are not

        // 2 words in the file we just decrypted are actual words
        // and the rest are not, so that means that your key is incorrect


    }
}