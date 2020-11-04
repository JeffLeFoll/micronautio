package coop.avalonlab.awesome;

import javax.inject.Inject;

public class MyAwesomeImplTwo implements MyAwesomeInterface {

    @Inject
    MyAwesomeImplTwo() {}

    @Override
    public String getAwesomeName() {
        return this.getClass().getSimpleName();
    }
}
