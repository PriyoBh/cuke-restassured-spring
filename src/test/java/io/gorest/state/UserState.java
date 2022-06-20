package io.gorest.state;

import io.cucumber.spring.ScenarioScope;
import io.gorest.models.User;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@ScenarioScope
public class UserState {
    @Getter
    @Setter
    private List<User> users;
}
