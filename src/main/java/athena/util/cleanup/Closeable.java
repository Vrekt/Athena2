package athena.util.cleanup;

import athena.context.AthenaContext;

/**
 * Interface providing methods for disposing and refreshing.
 */
public interface Closeable {

    /**
     * Invoked after a refresh/re-authentication has occurred.
     */
    void refresh(AthenaContext context);

    /**
     * Closes the provider and clears all maps/lists/listeners, etc..
     */
    void dispose();

    /**
     * Will remove any thing still meant for the last connection/instance.
     */
    void clean();

}
