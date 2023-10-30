package ir.digixo;

import jakarta.jws.WebService;

@WebService(endpointInterface = "ir.digixo.HelloWorld")
public class HelloWorldImpl implements HelloWorld{
    @Override
    public Human getHuman(Human human) {
        human.setId(human.getId());
        human.setName(human.getName());
        return human;
    }
}
