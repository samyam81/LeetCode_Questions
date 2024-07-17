class PalindromePartioning {
    public List<List<String>> partition(String s) {
        List<List<String>> Ss40 = new LinkedList<>();
        solve(s,Ss40,new LinkedList<>(),0);
        return Ss40;   
    }

    public void solve(String s, List<List<String>> Ss40,List<String> Samyam,int index ){
        if(index==s.length()) {
            Ss40.add(new LinkedList<>(Samyam));
        }
        for(int i=index;i<s.length();i++){
            String substring=s.substring(index,i+1);

            if(isPalindrome(substring)){
                Samyam.add(substring);
                solve(s, Ss40, Samyam,i+1 );
                Samyam.remove(Samyam.size()-1);
            }
        }

    }

public boolean isPalindrome(String str) {
    return str.equals(new StringBuilder(str).reverse().toString());
}

}
