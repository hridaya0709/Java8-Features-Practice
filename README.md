This project consists of my practice for latest features from Java version 8.
I have aimed for the following roadmap which consists of Java 8 to 21 features.

🔹 Step 1: Strengthen Java 8 (Foundation for Modern Java)
Most real-world projects still rely on Java 8 features, so master these first:
Lambdas & Functional Interfaces (Predicate, Consumer, Function)
Streams API (map, filter, reduce, collect, parallel streams)
Optional
Default & Static methods in Interfaces
Date & Time API (java.time)
👉 Practice small problems: filtering lists, grouping data, date manipulations, etc.

🔹 Step 2: Java 9–11 (Modules & Utility Updates)
Java 9 → Modules (module-info.java), Stream.ofNullable(), takeWhile(), dropWhile(), Optional.ifPresentOrElse().
Java 10 → var (local variable type inference).
Java 11 → New String methods (isBlank, lines, repeat), Files.readString(), HttpClient API.
👉 Practice by refactoring Java 8 code using var and new String/Stream APIs.

🔹 Step 3: Java 12–14 (Preview Features Start)
Java 12 → Switch Expressions (preview).
Java 13 → Text Blocks (""" multiline strings """).
Java 14 → Records (preview), Pattern Matching for instanceof.
👉 Try rewriting switch cases with expressions, use text blocks for JSON/XML strings.

🔹 Step 4: Java 15–17 (Stable Modern Java)
Java 15 → Sealed Classes (preview).
Java 16 → Records (stable), Pattern Matching (stable), Stream enhancements.
Java 17 (LTS) → Sealed Classes (final), Pattern Matching refinements.
👉 Use Records for DTOs in a sample project, experiment with sealed hierarchies.

🔹 Step 5: Java 18–21 (Latest & Future-Oriented)
Java 18 → UTF-8 as default charset, simple web server for testing.
Java 19 → Virtual Threads (preview, Project Loom).
Java 20 → Scoped values, more Loom improvements.
Java 21 (LTS) → Virtual Threads (final), Pattern Matching for switch (final), Record patterns, Sequenced Collections API.
👉 Write a small multithreading demo with Virtual Threads and compare with normal threads.

🔹 Step 6: Practical Learning Approach
Learn Features Incrementally → Don’t jump to Java 21 directly. Move in order, but focus more on Java 8, 11, 17, and 21 (all LTS versions).
Hands-on Mini Projects →
Data filtering with Streams/Optionals.
REST client with Java 11 HttpClient.
DTOs with Records.
Concurrent task executor with Virtual Threads.
Resources:
Modern Java in Action (covers 8–11 well).
Java official release notes (very concise).
Practice on Exercism or LeetCode using new features.
