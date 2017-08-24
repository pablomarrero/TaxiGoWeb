package uy.taxigo.web.cucumber.stepdefs;

import uy.taxigo.web.TaxiGoWebApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = TaxiGoWebApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
