Feature: Age calculator

  Scenario: Calculate age from birthdate
    Given korisnik je uneo datum rođenja "2000-01-01"
    When izračunam broj dana do današnjeg datuma
    Then rezultat treba da bude tačan broj dana