package coop.avalonlab.awesome;

import javax.inject.Inject;

public class MyAwesomeImplFour implements MyAwesomeInterface {

    @Inject
    MyAwesomeImplFour() {}

    @Override
    public String getAwesomeName() {
        return this.getClass().getSimpleName();
    }
}
