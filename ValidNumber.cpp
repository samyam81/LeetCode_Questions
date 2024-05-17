class ValidNumber {
public:
bool c(string s){
    for(auto i:s){
        if(i>='a'&& i<='z' && i!='e'|| i>='A'&& i<='Z' && i!='E'){
            return 0;
        }
        i++;
    }
        return 1;
}
bool cbp(string s,int n){
    int i=0;
    while(i<n){
        if(s[i]=='e' || s[i]=='E' || s[i]=='-' || s[i]=='+'){
            return 0;
        }
        i++;
    }
    return 1;
}
bool cap(string s,int i){
    int n=s.size();
    while(i<n){
        if(s[i]=='-' || s[i]=='+'){
            return 0;
        }
        if(s[i]=='e'&&s[i]=='e'){
            break;
        }
        i++;
    }
    return 1;
}

bool cep(string s,int i){
    int n=s.size();
    if(s[i]=='-'||s[i]=='+'){
        s.erase(i,1);
    }
    // cout<<s[i];
    if(s[i]=='0' && i == n-1){
        return 1;
    }

    if(i==n){
        return 0;
    }
    n=s.size();
    while(i<n){
        if(s[i]=='-' || s[i]=='+' || s[i]=='.' ){
        return 0;
    }
    i++;
    }
    return 1;
}

    bool isNumber(string s) {
        int n=s.size();
        if(!c(s)){
            return 0;
        }
        if((s[0]=='+'||s[0]=='-')&& n==1){
            return 0;
        }
        if(s[0]=='+'||s[0]=='-'){
            s.erase(0,1);
        }
        if(s[0]=='+'||s[0]=='-'){
            return 0;
        }
        int f=0,d=0;
        int pe=-1,pd=-1;
        int i=0;
        n=s.size();   
        int j=0;
        while(j<n){
            if((s[j]=='-' || s[j]=='+') && j==n-1){
                return 0;
            }
            else if(s[j]=='+'||s[j]=='-'){
                if((s[j-1]>='0'&& s[j-1]<='9')&& (s[j+1]>='0'&&s[j+1]<='9')){
                    return 0;
                }
            }
            j++;
        } 
        while(i<n){
            if(s[i]=='E'||s[i]=='e'){
                f++;
                pe=i;
            }
            if(s[i]=='.'){
                d++;
                pd=i;
            }
            if(f==2||d==2){
                return 0;
            }
            i++;
        }
        if(pd==0 && n==1){
            return 0;
        }
        if(pd==0 && n>1 && (s[pd+1]<'0' || s[pd+1]>'9')){
            return 0;
        }
        if(pe==0 && n==1){
            return 0;
        }

        if(pd!=-1){
        if(!cbp(s,pd)){
            return 0;
        }
        if(!cap(s,pd+1)){
            return 0;
        }
        }
        if(pe!=-1){
        if(!cep(s,pe+1)){
            return 0;
        }
        if(pe==0 || s[pe-1]!='.'){
        if(pe==0 || s[pe-1]<'0' || s[pe-1]>'9'){
            return 0;
        }
        }
        }
        if(i==n){
            return 1;
        }
        return 1;
    }
};
