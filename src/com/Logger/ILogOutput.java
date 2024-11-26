package com.Logger;

public interface ILogOutput {

    void write(String message);

    void close() throws Exception;
}
