package io.tofpu.messagepresenter;

import java.util.function.Supplier;

/**
 * A holder for a {@link MessagePresenterBase}.
 */
public interface MessagePresenterHolder {
    /**
     * @param presenter Supplier that returns the presenter
     *
     * @return the presenter to be used for chaining calls
     */
    MessagePresenterHolderImpl with(final Supplier<? extends MessagePresenterBase> presenter);

    /**
     * @return the result of this presentation holder
     */
    String getResult();
}
