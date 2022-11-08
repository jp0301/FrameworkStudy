SELECT USER
FROM DUAL;
--==>> SYS

--■■■ 오라클 암호화 복호화01_sys ■■■--
/*
1. 오라클 암호화 기능을 사용하기 위해서는
   『DBMS_OBFUSCATION_TOOLKIT』 패키지를 이용한다.
   암호화, 복호화 알고리즘을 직접 구현하는 것도 가능하다.
   하지만, 편의상 오라클에서 제공해주는 패키지를 통해 구현할 수 있다.
   
2. 『DBMS_OBFUSCATION_TOOLKIT』 패키지는
   기본적으로 사용할 수 없는 상태로 설정되어 있다. (DEFAULT 설정 상)
   이 패키지를 사용하기 위해서는 추가 설치 과정이 필요하다.
   (dbmsobtk.sql, prvtobtk.plb 파일을 찾아서 실행할 수 있도록 한다.
   
   
*/