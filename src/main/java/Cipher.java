public class Cipher {
    private String statement;
    private int key;

    public Cipher (String statement,int key){
        this.statement =statement;
        this.key =key;
    }

    public String getStatement() {
        return this.statement;
    }
    public int getKey(){
        return this.key;
    }
    public String isEncrypted(){
        statement="b";
        return statement;
    }
}
