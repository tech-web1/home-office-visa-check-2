@Regression

Feature: Visa Confirmation
  As user I want to login into HomeOffice Visa  website

 @smoke
  Scenario: AnAustralianComing To UKFor Tourism
   Given   I am on homepage
   When    I click on Start button
   And     I select Nationality Australia
   And     I click on Continue button
   And     I select reason Tourism
   And     I click on continue button
   Then  I verify the result You will not need a visa to come to the UK

 @sanity
   Scenario: AChilean ComingToThe UK ForWork And Plans On Staying For Longer Than SixMonths
   Given     I am on Homepage
   When      I Click on Start button
   And       I select Nationality Chile
   And       I Click on Continue button
   And       I Select Reason work Academic visit or Business
   And       I click on Continue button
   And       I select intended to stay for longer than 6 months
   And       I click on Continue button
   And       I select to work for Health and care Professional
   And       I click on Continue button
   Then      I verify the result you need a visa to work in health and care


  @Regression
  Scenario:A Columbian National Coming To The UK To Join APartner For ALongStay They Do Have An Article10Or20Card
    Given   I am on Homepage
    When    I click on start button
    And     I select Nationality Colombia
    And     I click On Continue button
    And     I select reason Join a partner or Family for long time
    And     I click on continue button
    And     I Select state My partner of family member have uk immigration status yes
    And     I click on continue button
    Then    I verify result you will need a visa to join your family or partner in the uk


