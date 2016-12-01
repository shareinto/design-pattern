// Learn more about F# at http://fsharp.org
// See the 'F# Tutorial' project for more help.
open System
open VisitorElement
open VisitorExtension

let View (element,visitor) = 
    match box element, box visitor with
    | (:? Element1 as element),(:? Visitor1 as visitor) -> visitor.View(element)
    | (:? Element2 as element),(:? Visitor1 as visitor) -> visitor.View(element)
    | (:? Element1 as element),(:? Visitor2 as visitor) -> visitor.View(element)
    | (:? Element2 as element),(:? Visitor2 as visitor) -> visitor.View(element)
    | _ -> printf "error occurd"

let elements : Object list = [new Element1(); new Element2()]

List.map View (List.map (fun element -> element,new Visitor1()) elements) |> ignore
List.map View (List.map (fun element -> element,new Visitor2()) elements) |> ignore

Console.ReadKey(true) |> ignore