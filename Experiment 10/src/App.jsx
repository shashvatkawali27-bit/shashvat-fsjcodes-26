import { useState } from 'react'
import heroImg from './assets/hero.png'
import reactLogo from './assets/react.svg'
import viteLogo from './assets/vite.svg'
import './App.css'

function App() {
  const [colour, setColour] = useState("--")


  function HandleClick(c){
    setColour(c);
    document.querySelector("body").style.backgroundColor=c;
  }

  return (
    <>
        <div className="container">
      <div className="header-box">
        <h1>
          You have clicked {colour} button
        </h1>
      </div>
      
      <div className="button-group">
        <button className="btn btn-red" onClick={(e) => HandleClick('red')}>red</button>
        <button className="btn btn-blue" onClick={(e) => HandleClick('blue')}>blue</button>
        <button className="btn btn-yellow" onClick={(e) => HandleClick('yellow')}>yellow</button>
        <button className="btn btn-green" onClick={(e) => HandleClick('green')}>green</button>
      </div>
    </div>
    </>
  )
}

export default App
