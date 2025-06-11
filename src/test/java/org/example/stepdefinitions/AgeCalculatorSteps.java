package org.example.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import static org.junit.Assert.assertEquals;

public class AgeCalculatorSteps {

    private LocalDate birthDate;
    private long result;

    @Given("korisnik je uneo datum rođenja {string}")
    public void korisnik_je_uneo_datum_rodenja(String datum) {
        birthDate = LocalDate.parse(datum);
    }

    @When("izračunam broj dana do današnjeg datuma")
    public void izracunam_broj_dana_do_danasnjeg_datuma() {
        LocalDate today = LocalDate.now();
        result = ChronoUnit.DAYS.between(birthDate, today);
    }

    @Then("rezultat treba da bude tačan broj dana")
    public void rezultat_treba_da_bude_tacan_broj_dana() {
        LocalDate today = LocalDate.now();
        long expected = ChronoUnit.DAYS.between(birthDate, today);
        System.out.println("Osoba ima " + result + " dana. ");
        assertEquals(expected, result);
    }
}