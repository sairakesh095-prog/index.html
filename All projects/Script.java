{\rtf1\ansi\ansicpg1252\cocoartf2822
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww11520\viewh8400\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 document.addEventListener("DOMContentLoaded", () => \{\
  const form = document.getElementById("issueForm");\
  const issuesContainer = document.getElementById("issuesContainer");\
\
  form.addEventListener("submit", (e) => \{\
    e.preventDefault();\
\
    // Collect form data\
    const title = document.getElementById("title").value;\
    const category = document.getElementById("category").value;\
    const description = document.getElementById("description").value;\
    const location = document.getElementById("location").value;\
\
    // Create new issue element\
    const li = document.createElement("li");\
    li.innerHTML = `\
      <p class="issue-title">$\{title\}</p>\
      <p class="issue-category">Category: $\{category\}</p>\
      <p>$\{description\}</p>\
      <p><strong>Location:</strong> $\{location\}</p>\
      <p>Status: <span style="color: green;">Pending</span></p>\
    `;\
\
    // Append to list\
    issuesContainer.appendChild(li);\
\
    // Reset form\
    form.reset();\
  \});\
\});\
}