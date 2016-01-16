# wesite
  Hello wesite
  
# Convention
 * commit	message
	[add|impl|remove|fix package.target(.target())](comment)

 * Example
    - method
	    [add Main.main()]
    - class
	    [impl Main class]

 * Requirement
    1. push는 무조건 하나의 작업 플로우가 끝났을 때만 수행
    2. push하기 전에 반드시 pull하고 conflict 발생 시 해결
    3. pc를 여러개 사용할 때 작업이 끝나면 commit & push하기
