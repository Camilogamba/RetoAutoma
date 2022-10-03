@star_sharp
Feature: Automated tests starsharp application

  Background:
    Given than john has an account in starsharp
      | username | password |
      | admin    | serenity |

  @createUnitBusiness
  Scenario: Business unit creation validation
    When he create a business unit
      | name     | parentUnit     |
      | testUnit | administration |
    Then a business unit "testUnit" is successfully created

  @scheduleMeeting
  Scenario: Business unit creation validation
    When he goes to meetings and schedules a meeting
      | nameReu     | type    | number | starDate   | starHour | endDate    | endHour | location | unit     | organized    | reporter    | contact      |
      | testReuAuto | General | 109994 | 11/07/2022 | 11:15    | 11/07/2022 | 12:10   | HQ-01    | testUnit | Adam Edwards | Aron Taylor | Allison Bell |

    Then the meeting number "testReuAuto" is created successfully