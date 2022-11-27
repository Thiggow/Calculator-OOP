import javax.script.*;

public class Expression {
    
    private String value;

    public void setValue(String value){

        this.value = value;
    }

    public String getValue(){

        return this.value;
    }

    public Object formatValue(String value){

        ScriptEngineManager factory = new ScriptEngineManager();
        ScriptEngine engine = factory.getEngineByName("JavaScript");

        try{
            return engine.eval(value);
        }
        catch(Exception e){
            System.out.println("Error");
            e.printStackTrace();
            return engine;
        }
    }
}
