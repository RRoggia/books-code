## 26/08

Extensão pra código Javascript é sempre `.js`. Outras linguagens de programação usaram outras extensões.

Javascript não é Java, só tem Java no nome.

Por que tantas linguaguens?
As vão evoluindo com o tempo dependendo de quanto poder computacional e quais problemas tentamos resolver. As linguages normalmente adicionam abstrações (camadas) em cima de linguagens antigas facilitando a quantidade de conhecimento / trabalho pra se usar a linguagem.

O que elas tem em comum?
Pra criar de uma linguagem de programação tu vai ter que passar por conceitos de linguagens formais.
Toda linguagem tem que ter alguma forma de identificar a estrutura do código (compilador, maquina virtual).

- escrever arquivos
- conectar na internet
- transferir dados

Logica de programção se aplica em todas linguaguens
Conceitos que são em comum. 
- Funções

## 29/08


# Conteúdo Livro

## 1. Valores, Tipos e Operadores
`console.log()` loga coisas na tela

## 2. Estrutura do Programa
- Expressões (expressions)
- Declaração (statement)
- Efeitos Colaterais (side effect)
- Váriaveis (binding, variable)
  - `let`, `var`, `const`
- Palavras reservadas (keyword)
  - ` break case catch class const continue debugger default
  delete do else enum export extends false finally for
  function if implements import interface in instanceof let
  new package private protected public return static super
  switch this throw true try typeof var void while with yield `
- Funções (functions)
  - Invocação (invoking, calling, applying)
  - Argumentos (arguments)
  - `console.log`
  - `return`
- Fluxo de controle (control flow)
  - `if`
  - `while` e `do`
  - `for`
    - initializes, checks, updates
  - `break`
  - `continue`
  - `switch`
- `block` Escopo (Scope)
- Identação (Identation)
- Syntax Sugars (++ -- += -=)
- Comentários (Comments)

> A fragment of code that produces a value is called an expression
> a JavaScript statement corresponds to a full sentence. 
> A program is a list of statements.
> (Something that affects the world) These changes are called side effects. 
> (Variables) They do not contain values; they grasp them—two bindings can refer to the same value.
> A function is a piece of program wrapped in a value
> Executing a function is called invoking, calling, or applying it. 
> Values given to functions are called arguments.
> Functions may also produce values, in which case they don’t need to have a side effect to be useful. 
> Looping control flow allows us to go back to some point in the program where we were before and repeat it with our current program state. 
> do loop always executes its body at least once, and it starts testing whether it should stop only after that first execution.
> (Identation) The important thing is that each new block adds the same amount of space.


## 3. Functions
- Funções (Functions)
  - why
    - Structure
    - Reuse of code - avoid repetition
    - isolate programs
  - Palavra reservada (keyword)
  - Parameters
  - Body
  - Return statement
- Escopo (Scope)
  - Global
  - Local
  - Lexical Scoping
  - Shadowing
  - Closure
- Declaration Function
- Arrow Function


> It gives us a way to structure larger programs, to reduce repetition, to associate names with subprograms, and to isolate these subprograms from each other.
> A return statement determines the value the function returns. When control comes across such a statement, it immediately jumps out of the current function and gives the returned value to the code that called the function. 
>  A return keyword without an expression after it will cause the function to return undefined. Functions that don’t have a return statement at all, such as makeNoise, similarly return undefined.
> Each binding has a scope, which is the part of the program in which the binding is visible. 
> But bindings created for function parameters or declared inside a function can be referenced only in that function, so they are known as local bindings.
> Bindings declared with let and const are in fact local to the block that they are declared in, so if you create one of those inside of a loop, the code before and after the loop cannot “see” it. 
> Each scope can “look out” into the scope around it, so x is visible inside the block in the example. The exception is when multiple bindings have the same name—in that case, code can see only the innermost one
> Blocks and functions can be created inside other blocks and functions, producing multiple degrees of locality.
> Each local scope can also see all the local scopes that contain it, and all scopes can see the global scope. This approach to binding visibility is called lexical scoping.
>  It is possible to store a function value in a new binding, pass it as an argument to a function, and so on
> Function declarations are not part of the regular top-to-bottom flow of control. They are conceptually moved to the top of their scope and can be used by all the code in that scope

## Data Structures: Objects and Arrays

> JavaScript provides a data type specifically for storing sequences of values. 
> It is called an array and is written as a list of values between square brackets, separated by commas.



