package coop.avalonlab.awesome;

import javax.inject.Inject;

public class MyAwesomeImplOne implements MyAwesomeInterface {

    @Inject
    MyAwesomeImplOne() {}

    @Override
    public String getAwesomeName() {
        return this.getClass().getSimpleName();
    }
}
