package br.com.caelum.vraptor;

public class VRaptorException extends Exception {

    public VRaptorException(Throwable e) {
        super(e);
    }

    public VRaptorException(String msg) {
        super(msg);
    }

}
