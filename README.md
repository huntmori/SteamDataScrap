# JSoup, Selenium을 이용한 Web Data scraping
## 작동 순서
### 정적 페이지 스크랩
  ><ol>
  > <li>정적 페이지에서 읽기</li>
  > <li>HTML 파싱 </li>
  > <li>데이터 가공</li>
  > <li>데이터 저장(sql output 으로 대체</li>
  ></ol>
---
### 동적 페이지 스크랩
><ol>
  ><li>Selenium을 이용해 해당 페이지 로드<
  ><li>스크롤 이벤트를 발생시켜 데이터 로드</li>
  ><li>html 파싱</li>
  ><li>데이터 가공</li>
  ><li>형태소 분석 (komoran 사용)</li>
  ><li>데이터 저장 (sql output으로 대체) </li>
