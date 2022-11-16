//
// IsmTransition.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct IsmTransition: Codable {

    public var type: String?
    public var currentState: DvCodedText
    public var transition: DvCodedText?
    public var careflowStep: DvCodedText?
    public var reason: [DvText]?

    public init(type: String? = nil, currentState: DvCodedText, transition: DvCodedText? = nil, careflowStep: DvCodedText? = nil, reason: [DvText]? = nil) {
        self.type = type
        self.currentState = currentState
        self.transition = transition
        self.careflowStep = careflowStep
        self.reason = reason
    }

    public enum CodingKeys: String, CodingKey { 
        case type = "_type"
        case currentState = "current_state"
        case transition
        case careflowStep = "careflow_step"
        case reason
    }

}
