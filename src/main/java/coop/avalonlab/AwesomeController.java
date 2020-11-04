package coop.avalonlab;

import coop.avalonlab.awesome.MyAwesomeInterface;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Produces;

import javax.inject.Inject;
import java.util.Set;
import java.util.stream.Collectors;

@Controller("/micronaut")
public class AwesomeController {

    private final Set<MyAwesomeInterface> myAwesomeInterfaces;

    @Inject
    public AwesomeController(Set<MyAwesomeInterface> myAwesomeInterfaces) {
        this.myAwesomeInterfaces = myAwesomeInterfaces;
    }

    @Get
    @Produces(MediaType.TEXT_PLAIN)
    String getAwesomeName() {
        return myAwesomeInterfaces.stream()
                .map(MyAwesomeInterface::getAwesomeName)
                .collect(Collectors.joining("\r\n"));
    }
}
