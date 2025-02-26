public class DNA {

    public static String countNucleotides(String dna) {
        int A = 0;
        int C = 0;
        int G = 0;
        int T = 0;

        for (int i = 0; i < dna.length(); i++) {
            char letter_counted = dna.charAt(i);

            if (letter_counted == 'A') {
                A = A + 1;
            } 
            else if (letter_counted == 'C') {
                C = C + 1;
            } else if (letter_counted == 'G') {
                G = G + 1;
            } 
        else if (letter_counted == 'T') {
                T = T + 1;}}

        String result = "A: " + A + ", C: " + C + ", G: " + G + ", T: " + T;

        return result;}



    public static String transcribe(String dna) {
        String rna = "";

        for (int i = 0; i < dna.length(); i++) {
        char letter_t = dna.charAt(i);
            if (letter_t == 'T') {
                rna = rna + 'U';} 
                else {
                rna = rna + letter_t;
            }}
        return rna;}




    public static String reverseComplement(String dna) {
    String new_reverse = "";

        for (int i = dna.length() - 1; i >= 0; i--) {
            char letter2 = dna.charAt(i);
            if (letter2 == 'A') {
                new_reverse = new_reverse + 'T';
            } 
            else if (letter2 == 'T') {
                new_reverse = new_reverse + 'A';} 
            else if (letter2 == 'C') {
                new_reverse = new_reverse + 'G';

            } else if (letter2 == 'G') {
                new_reverse = new_reverse + 'C';
            }}
        return new_reverse;}



    public static void main(String[] args) {
        String fahad_example = "AGCTTTTCATTCTGACTGCAACGGGCAATATGTCTCTGTGTGGATTAAAAAAAGAGTGTCTGATAGCAGC";
        System.out.println(countNucleotides(fahad_example));

        String example2 = "GATGGAACTTGACTACGTAAATT";
        System.out.println(transcribe(example2));

        String example3 = "AAAACCCGGT";
        System.out.println(reverseComplement(example3));

    }
}




