#autor Chris

  @stories
  Feature: look the news in the economic activity section
    as a user i want to read an especific news of economic activity

  @scenario1
  Scenario Outline: read the article evolucion del contexto macroeconomico y global al inicio del 2021
    Given Chris entered in the bancolombia page
    When he download the monthly economic report
    Then he should read the report correctly

    Examples:
    | newsTitle                                                           |
    | "evolucion del contexto macroeconomico y global al inicio del 2021" |