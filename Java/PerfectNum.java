class PerfectNum {
    public boolean checkPerfectNumber(int num) {
        int temp=0;
        for(int i=num-1;i > 0;i--){
            if(num % i==0) temp+=i;
        }
        if(num==temp) return true;
        return false;
    }
}

// to do faster do thiss::::
// public boolean checkPerfectNumber(int num) {
//     return (num==6 || num==28 || num==496 || num==8128 || num==33550336);
// }
