import Net from './Net.ts'

class Pin {
  _net: Net
  _name: String

  constructor( name: String ){
    this._net = new Net( 'Empty', [] )
    this._name = name
  }

  static createWithNet( name: String, net: Net ) {
    const thisPin = new Pin( name )
    thisPin._net = net
    return thisPin
  }

  get name (){
    return this._name
  }

  signal( numberOfHops: number) {
    console.log( `Signal received by pin ${this._name}` )
    if( this._net ){
      console.log( `Sending signal to Net ${ this._net.name}` )
      this._net.signal( numberOfHops )
    } else {

    }
  }
}

export default Pin