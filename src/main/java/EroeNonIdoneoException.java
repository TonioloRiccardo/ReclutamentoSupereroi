public class EroeNonIdoneoException extends Exception {
    public EroeNonIdoneoException(String nomeEroe, int livello) {
        super(nomeEroe + "non è idoneo alla missione. Il livello (" + livello + ") è troppo basso.");
    }
}
