import Pin from './Pin.ts'

class ComponentInstance {
  _pins: Array<Pin>
  _name: String

  constructor( name: String, pins: Array<Pin> ){
    this._name = name
    this._pins = pins
  }

  signal( numberOfHops: number) {
    console.log( `Signal from Component Instance ${this._name}` )

    console.log( `Start sending signals to pins ...`)
    for( let pin of this._pins) {
      console.log( `Send signal to pin ${ pin.name }` )
      pin.signal( numberOfHops )
    }
  }
}

export default ComponentInstance