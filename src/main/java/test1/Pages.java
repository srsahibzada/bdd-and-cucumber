package test1;

public class Pages {

  public enum PAGE_TYPE {
    ADDITION, SUBTRACTION, MULTIPLICATION, INTDIVISION, NONEDEFAULT, ERROR
  }

  private Integer pageResult;
  private PAGE_TYPE currentPage;

  public Integer getPageResult() {
    return this.pageResult;
  }

  public void setPageResult(Integer pageResult) {
    this.pageResult = pageResult;
  }

  public Integer getPageTypeAsNumber() {
    return Integer.valueOf(currentPage.toString());
  }

  public PAGE_TYPE getPageType() {
    return this.currentPage;
  }

  public void resetEverythingAfterTest() {
    this.currentPage = PAGE_TYPE.NONEDEFAULT;
    this.pageResult = null;
  }



  public Integer additionPage(Integer a, Integer b) {
    this.currentPage = PAGE_TYPE.ADDITION;
    this.pageResult = a + b;
    return this.pageResult;
  }

  public Integer subtractionPage(Integer a, Integer b) {
    this.currentPage = PAGE_TYPE.SUBTRACTION;
    this.pageResult = a - b;
    return this.pageResult;
  }

  public Integer multiplicationPage(Integer a, Integer b) {
    this.currentPage = PAGE_TYPE.MULTIPLICATION;
    this.pageResult = a * b;
    return this.pageResult;
  }

  public Integer divisionPage(Integer a, Integer b) {
    this.currentPage = PAGE_TYPE.INTDIVISION;
    try {
      this.pageResult = a / b;
    } catch (ArithmeticException e){
        this.pageResult = null;
        this.currentPage = PAGE_TYPE.ERROR;
    }
    return this.pageResult;
  }


}
