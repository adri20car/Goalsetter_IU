    # language: en
    @ANDROID

    Feature: Goalsetter APP

      Background:

        Given the user is already registered to the Goalsetter APP "diego+auto03@goalsetter.co" y "Gs@12345"
        Given I am logged in as a site owner "Welcome"

      Scenario:Verify the Parent wallet’s balance using the mobile app

        Given I am on homepage
        And I want to check the balance of my wallet
        When I click the image of the wallet in the lower menu
        Then I enter my wallet

      Scenario Outline:Verify that the 1st child name is “German” using the mobile app

        Given I am on homepage
        And I want to verify the first child
        And I scroll down to the second container
        When I click on tab savings
        Then I verify that the name is "<Name>"


        Examples:
        |Name|
        |Germans Savings|