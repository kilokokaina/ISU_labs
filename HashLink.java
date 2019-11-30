class HashLink {
    static long hash;
    static int p_pow;

    static int hashKey(String key_in) {
        hash = 0;
        int p = 53;
        p_pow = 1;

        char[] key_array = key_in.toCharArray();

        for (int i = 0; i < key_in.length(); i++) {
            hash += (key_array[i] - 'a' + 1) * p_pow;
            p_pow *= p;

            //System.out.print("hash: " + hash + " p_pow: " + p_pow + "\n");
        }

        int value = (int) hash % 1024;
        if (value < 0) return value * -1;
        else return value;
    }
}
