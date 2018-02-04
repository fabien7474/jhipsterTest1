package ch.benichou.jhipster.test1.cucumber.stepdefs;

import ch.benichou.jhipster.test1.JhipsterTest1App;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = JhipsterTest1App.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
