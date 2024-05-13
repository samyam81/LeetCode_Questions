class ExcelONE {
public:
    string convertToTitle(int columnNumber) {
        std:: string columntitle;
        while(columnNumber>0){
            int remainder=(columnNumber-1) % 26;
            char digit='A'+remainder;
            columntitle=digit+columntitle;
            columnNumber = (columnNumber - 1) / 26;
        }
        return columntitle;
    }
};
