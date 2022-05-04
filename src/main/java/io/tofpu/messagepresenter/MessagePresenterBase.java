package io.tofpu.messagepresenter;

/**
 * Base class for message presenter.
 */
public abstract class MessagePresenterBase {
    /**
     * @param message the message to append to this object
     *
     * @return this instance of the object; for chaining purposes
     */
    public abstract MessagePresenterBase append(final String message);

    /**
     * @return the result of the message presentation
     */
    public abstract String getResult();

    public abstract static class Builder {
        public abstract Builder append(final String message);
        public abstract MessagePresenterBase build();
    }
}
