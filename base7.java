class base7 {
    public String convertToBase7(int num) {
         if (num == 0) return "0";
         boolean negative=false;
         if(num <0){
                        negative = true;
            num = -num;
        }

        StringBuilder result = new StringBuilder();
        while (num > 0) {
            int remainder = num % 7;
            result.insert(0, remainder);
            num /= 7;
        }

        if (negative) {
            result.insert(0, "-");
        }

        return result.toString();
    }
}
