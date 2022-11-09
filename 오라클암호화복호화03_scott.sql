SELECT USER
FROM DUAL;
--==>> SCOTT

--���� �ۼ��� ��ȣȭ/��ȣȭ ��Ű�� �׽�Ʈ ����--

SELECT *
FROM TAB;

--�� �ǽ� ���̺� ����
CREATE TABLE TBL_EXAM
( ID NUMBER
, PW VARCHAR2(30)
);
--==>> Table TBL_EXAM��(��) �����Ǿ����ϴ�.

--�� ������ �Է�
INSERT INTO TBL_EXAM(ID, PW) VALUES(1, 'suer1234');
--==>> 1 �� ��(��) ���ԵǾ����ϴ�.

--�� Ȯ��
SELECT *
FROM TBL_EXAM;
--==>>
/*
        ID PW                            
---------- ----------
         1 suer1234  
*/

--�� �ѹ�
ROLLBACK;
--==>> �ѹ� �Ϸ�.

--�� ��ȣȭ/��ȣȭ ��Ű���� ��ȣȭ �Լ��� Ȱ���Ͽ� ������ �Է�
INSERT INTO TBL_EXAM(ID, PW) VALUES(1, CRYPTPACK.ENCRYPT('suer1234', 'SUPERMAN'));
--==>> 1 �� ��(��) ���ԵǾ����ϴ�.

--�� Ȯ��
SELECT *
FROM TBL_EXAM;
--==>>
/*
   ID PW                            
----- -------
    1 Mp?T?   
*/

--�� Ŀ��
COMMIT;
--==>> Ŀ�� �Ϸ�.


--�� �׽�Ʈ �� ����
SELECT ID, CRYPTPACK.DECRYPT(PW, 'SUPERMAN') AS PW
FROM TBL_EXAM;
--==>> 1	suer1234

SELECT ID, CRYPTPACK.DECRYPT(PW, 'BATMAN') AS PW
FROM TBL_EXAM;
--==>> 1	!/??g













