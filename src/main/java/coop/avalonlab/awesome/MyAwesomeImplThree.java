package coop.avalonlab.awesome;

import javax.inject.Inject;

public class MyAwesomeImplThree implements MyAwesomeInterface {

    @Inject
    MyAwesomeImplThree() {}

    @Override
    public String getAwesomeName() {
        return this.getClass().getSimpleName();
    }
}
