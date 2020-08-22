package com.golden.tiny.exceptions;
import com.golden.tiny.tokens.Token;

public class InvalidExpressionException extends CompilerException {
    private Token token;

    public CompilerException(String message, Token token) {
        super(message);
        this.token = token;
    }
}
