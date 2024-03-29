import { React, useState } from 'react';
import styled, { keyframes, css } from 'styled-components';
import axios from 'axios';


const ModalNumber_Won = ({ closeModal, setValue }) => {
  const [isOpen, setIsOpen] = useState(true); // isOpen 상태 추가

  

  const handleOutsideClick = (e) => {  // 모달창 외부 누르면 모달창 닫히게 해주는 이벤트

    
    if (e.target.id === 'background') {
      
      //setValue(calc);
      setIsOpen(false);
      
      setTimeout(() => {
        closeModal(false);
      }, 700);

    }
  }

  const [calc, setCalc] = useState("");
  const [operCheck, setOperCheck] = useState(true);
  const [pointCheck, setPointCheck] = useState(true);

  const getNum = (e) => {
    setCalc((prev) => prev + e.target.value);
  };

  const delCalc = () => {
    setPointCheck(true);
    setOperCheck(true);
    let str = String(calc).slice(0, -1);
    setCalc((prev) => str);
  };

  //ModalNumber_Won으로부터 받은 값을 해당 상태값에 설정하는 함수
  const confirmAndClose = () => {
    
    setValue(calc);
    setIsOpen(false);
      
    setTimeout(() => {
      closeModal(false);
    }, 700);
  
 }
    return (
      <>
        
        <Container1 onClick={handleOutsideClick}>
          <ModalBlock isOpen={isOpen}>
          
          <div style={{ display: 'flex', flexDirection: 'column', alignItems: 'center'}}>
          <MainContainer> 
          <InputBar readOnly value={calc} />
            <ButtonContainer>
              <ButtonNumber value={1} onClick={getNum}>1</ButtonNumber>
              <ButtonNumber value={2} onClick={getNum}>2</ButtonNumber>
              <ButtonNumber value={3} onClick={getNum}>3</ButtonNumber>
              <ButtonNumber value={4} onClick={getNum}>4</ButtonNumber>
              <ButtonNumber value={5} onClick={getNum}>5</ButtonNumber>
              <ButtonNumber value={6} onClick={getNum}>6</ButtonNumber>
              <ButtonNumber value={7} onClick={getNum}>7</ButtonNumber>
              <ButtonNumber value={8} onClick={getNum}>8</ButtonNumber>
              <ButtonNumber value={9} onClick={getNum}>9</ButtonNumber>
              <ZeroButton value={0} onClick={getNum}>0</ZeroButton>

              <ButtonDEL onClick={delCalc}> ← </ButtonDEL>

            </ButtonContainer>
          </MainContainer>
      
          <ButtonClose onClick={confirmAndClose}> 확인 </ButtonClose> 
          </div>

          </ModalBlock>

          <Background id="background" />

        </Container1>          

      </>
    );
  }

  
  const fadeInUpAnimation = keyframes`
  from {
    transform: translateY(100%);

  }
  to {
    transform: translateY(0);
  }
`;

const fadeOutDownAnimation = keyframes`
  from {
    transform: translateY(0);
  }
  to {
    transform: translateY(100%);

  }
`;

const fadeInUp = css`
  ${fadeInUpAnimation} 0.6s ease-in-out forwards;
`;

const fadeOutDown = css`
  ${fadeOutDownAnimation} 0.6s ease-in-out forwards;
`;


const Container1 = styled.div`
    position: fixed;
    width: 454px;
    height: 600px;
    z-index: 100;

    top: 163px;
    left: 200px;
    right: 0px;
    bottom: 0px;

    display: flex;
`;



const Background = styled.div`
    position: fixed;
    width: 1440px;
    height: 882px;

`;

const ModalBlock = styled.div`

    position: absolute;
    top: 7.5rem;
    border-radius: 20px;
    background-color: white;
    color: black;

    width: 454px;
    height: 598.5px;

    border :5px solid #DEDEDE;
    z-index:101;

    animation: ${({ isOpen }) => (isOpen ? fadeInUp : fadeOutDown)};
    
    
`;


  const ButtonClose = styled.button`
  background: #D9DFF6;
  width: 454px;
  height: 111px;
  border-radius: 0px 0px 20px 20px;
  font-size: 32px;
  font-weight: 600;
  font-family: 'Pretendard';

  border: none;

   &:hover {
    cursor:pointer; 

   }
  `;

  const MainContainer = styled.div`
  display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: center;

  width: 454px;
  height: 489px;
  border-radius: 20px 20px 0px 0px ;
  `;

  const ButtonContainer = styled.div 
  `
  display: grid;
  grid-template-columns: repeat(3, minmax(0, auto));
  grid-template-rows: repeat(4, minmax(0, auto));
  gap: .5rem;

  grid-template-areas:
    "one two three"
    "four five six"
    "seven eight nine"
    "zero zero del";
  `;

  const ButtonNumber = styled.button`
  font-size: 36px;
  font-family: 'Pretendard';

  color: #646464;
  background: #F8F8F8;
  height: 68px;
  width: 128px;
  border: 1px solid #E6E6E6;
  border-radius: 8px;   
  margin: 1px;

  &[value="1"] { grid-area: one; }
  &[value="2"] { grid-area: two; }
  &[value="3"] { grid-area: three; }
  &[value="4"] { grid-area: four; }
  &[value="5"] { grid-area: five; }
  &[value="6"] { grid-area: six; }
  &[value="7"] { grid-area: seven; }
  &[value="8"] { grid-area: eight; }
  &[value="9"] { grid-area: nine; }

  &:hover {
    cursor:pointer; 
   }
  `;
  
  const ZeroButton = styled(ButtonNumber)`
  grid-area: zero;
  width: 265px;

  `;
  
  const ButtonDEL = styled(ButtonNumber)`
  grid-area: del;
  background: #EBEBEB;
  font-weight: bold;
  font-family: 'Pretendard';

  `;

  const InputBar = styled.input`
  width: 382px;
  height: 101px;
  background: #F0F0F0;
  border-radius: 8px;

  margin-bottom: 10px;
  font-family: 'Pretendard';

  font-size: 48px;
  font-weight: 600;

  color: black;

  border: none;
  text-align: right;
  padding-right: 20px;

  &:focus {
    outline: none;
  }
`;

export default ModalNumber_Won