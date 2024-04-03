Feature: Read Documents CSV, Excel, PDF

  @DocumentCSV @Test
  Scenario: Read Document CSV
    Given I have a CSV file named "Catalog_v2.csv"
    When read data from the CSV file
    Then show CSV data

  @DocumentPDF @Test
  Scenario: Read Document PDF
    Given I has made purchases with credit card
    When he reviews his transactions "ReadDocuments.pdf"
    Then show PDF data

