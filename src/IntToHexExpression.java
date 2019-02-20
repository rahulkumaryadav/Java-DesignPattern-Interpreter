public class IntToHexExpression implements Expression {

    private int i;
    public IntToHexExpression(int i) {
        this.i=i;
    }

    @Override
    public String interpreter(InterPreterContext interPreterContext) {
        return interPreterContext.getHexFormat(i);
    }
}
